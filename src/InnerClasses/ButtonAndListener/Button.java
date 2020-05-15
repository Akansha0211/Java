package InnerClasses.ButtonAndListener;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Ths function is to set onClickListner
     * It will handle the clicks
     * @param onClickListener  it will handle he clicks...
     */
   public void setOnClickListener(OnClickListener onClickListener){
       this.onClickListener = onClickListener;
   }

    /**
     * Button will set onClickListener() method which were created to assign an object to Button in order to handle clicks
     */
   public void onClick(){
       this.onClickListener.onClick(this.title);
   }
   public interface OnClickListener{
       public void onClick(String title);
   }

}
