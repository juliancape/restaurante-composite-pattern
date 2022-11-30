
package composite;
public class Leaf extends Component{

    public Leaf(String name, int price){
        super(name, price);
    }
    @Override
    public int execute() {
        return price;
    }
	@Override
	public String executeName() {
		// TODO Auto-generated method stub
		return name;
	}
}
