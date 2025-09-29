interface  Vehicle {
    void color();
    void brand();
    
}
abstract class JavaCar implements Vehicle{
    void disp(){
        System.out.println("This is Java Car");
    }
}
abstract class KotlinCar implements Vehicle{
    void disp(){
        System.out.println("This is Kotlin Car");
    }
}
class VehicleImpl implements Vehicle{

 @Override
    public void brand() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void color() {
        // TODO Auto-generated method stub
        
    }
    
}
class VehicleAbstractImpl1 extends JavaCar{

   @Override
    public void brand() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void color() {
        // TODO Auto-generated method stub
        
    }
    
}
class VehicleAbstractImpl2 extends KotlinCar{

    @Override
    public void brand() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void color() {
        // TODO Auto-generated method stub
        
    }

}
public class FactoryDP {
    public static void main(String[] args) {
        // Vehicle obj = new JavaCar();
        Vehicle obj1 = new VehicleImpl();
        Vehicle obj2 = new VehicleAbstractImpl1();
    }
    
}

