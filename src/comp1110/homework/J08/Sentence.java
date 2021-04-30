package comp1110.homework.J08;

public class Sentence {

    public static class Word{
        String value;
        Type type;

        public enum Type{
            NOUN,ADJECTIVE,VERB;
        }
        //Constructor of Word
        Word(String value, Type type){
            this.value=value;
            this.type=type;
        }
    }

    // Outer Fields
    public Word[] words;
    //Outer constructor
    public Sentence(int size){
        this.words=new Word[size];
    }

    //Outer method

    public Word.Type getType(Word w){
        return w.type;
    }



    public boolean validRule1(Sentence s){
        boolean result =true;
        if (s.words==null||s.words.length==0) {
            result=false;
        }else{
            int count =0;
            for (Word w:s.words){
                if(w.value.length()==0||w.value==null){
                    count++;
                }
            }
            if(count==s.words.length){
                result=false;
            }
        }
        return result;
    }

    public boolean validRule2(Sentence s){
        boolean result= true;
        for(int i =0; i<s.words.length-1;i++){
            if (s.words[i].type == Word.Type.NOUN){
                if(s.words[i+1].type != Word.Type.VERB){
                    result=false;
                }
            }
        }
        return result;
    }

    public boolean validRule3(Sentence s){
        boolean result =true;
        for(int i =0; i<s.words.length-1;i++){
            if (s.words[i].type == Word.Type.ADJECTIVE){
                if(s.words[i+1].type != Word.Type.NOUN
                        &&(s.words[i+1].type != Word.Type.ADJECTIVE
                        ||s.words[i+1] == s.words[i])){
                    result=false;
                }
            }
        }
        return result;
    }

    public int numberofVERB (Sentence s){
        int verbs = 0;
        for(Word w:s.words){
            if (w.type == Word.Type.VERB){
                verbs++;
            }
        }
        return verbs;
    }



    public boolean isValid(){

        boolean rule1=this.validRule1(this);


        if (rule1){
            boolean rule2= this.validRule2(this);
            boolean rule3=this.validRule3(this);
            int numberofVerbs=this.numberofVERB(this);

            boolean endValid = false;
            if (this.words[this.words.length-1].type==Word.Type.NOUN
                    ||this.words[this.words.length-1].type==Word.Type.VERB){
                endValid=true;
            }
            return rule2&&rule3&&(numberofVerbs==1)&&endValid;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {
        Sentence a = new Sentence(0);
        a.isValid();
    }


}
