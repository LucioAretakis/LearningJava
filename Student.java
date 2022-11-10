package entities;

public class Student {

    public Double primeiro;
    public Double segundo;
    public Double terceiro;

    public Double soma(){

        return primeiro + segundo + terceiro ;
        
    }
    public Double missing(){
        
        return 60 - soma();
    
    }
}

    

