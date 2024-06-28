
public class MIExcepcion extends Throwable{
    public MIExcepcion(){
        super();
    }

    public MIExcepcion(String error){
        super(error);
        System.out.println("Debes preocuparte mas sobre tu aprendizaje");
    }


}
