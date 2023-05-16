public class application{
    public void main (){
        Mother m= new Mother ();
        Mother m1 = new Child();
        m.show( ); // show of Mother is called
        m1.show();
        Child ch=new Child ( ); 
        ch. show ( ); // show ( ) inherited in Child from Mother is called
        }
}
