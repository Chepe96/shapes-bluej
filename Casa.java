class Casa
{
   //variables de instancia
   Circle ventana;
   Triangle techo;
   Square pared;
   Square puerta;
   
   //constructor
   /**
    * Se cran nuevos objetos de ventana, techo, pared y puerta, dentro del 
    * constructor.
    */
   Casa()
   {
       ventana = new Circle();
       techo = new Triangle();
       pared = new Square();
       puerta = new Square();
   }
   
   //metodos
   /**
    * Este metodo dibuja y colorea los elementos de la casa.
    */
   void dibujate()
   {
       techo.changeSize(70,150);
       pared.changeSize(100);
       puerta.changeSize(45);
       ventana.changeColor("red");
       techo.changeColor("black");
       pared.changeColor("green");
       puerta.changeColor("blue");
       ventana.makeVisible();
       techo.makeVisible();
       pared.makeVisible();
       puerta.makeVisible();
   }
   
   /**
    * Este metodo acomoda todos los elementos de la casa y les da una posicion
    * determinada a cada objeto.
    */
   void acomodate()
   {
       //colocar los objetos en la posicion
       //que les corresponde
       techo.moveHorizontal(110);
       pared.moveHorizontal(50);
       pared.moveVertical(35);
       ventana.moveHorizontal(125);
       ventana.moveVertical(30);
       puerta.moveHorizontal(80);
       puerta.moveVertical(90);
       
   }
}