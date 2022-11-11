
package composite;

public abstract class Component {
    public int price;
    public String name;
    
    public Component(String name,int price){
        this.name = name;
    	this.price=price;
    }
    public abstract int execute();
    public abstract String executeName();
}
