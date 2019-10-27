package Task20;


public class CatFacts {
   private String type = null;
   private String text;

   public CatFacts () {

   }
   public CatFacts(String type, String text){
       this.type = type;
       this.text = text;
   }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
