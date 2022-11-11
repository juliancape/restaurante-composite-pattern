
package composite;

import java.util.ArrayList;

public class Composite extends Component {
 
    public Composite(String name,int price){
        super(name, price);
    }
    
    public Composite(String name){
        super(name,0);
    }
    public ArrayList<Component> hijos = new ArrayList();
    
    public int execute(){
        price =0;
        for (Component component : hijos) {
			price += component.execute();
		}
        return price;
    }
    public String executeName() {
    	name = "";
    	for (Component component : hijos) {
			name += " con "+ component.executeName();
		}
    	int aux = 0;
    	name += "";
    	for (int i = 0; i < name.length(); i++) {
    		String s = ""+name.charAt(i);
    		if(s.equals(" ")) {
    			continue;
    		}
    		else if(s.equals(s.toUpperCase())) {
				aux = i;
				break;
			}
		}
    	String newName = "";
    	for (int i = aux; i < name.length(); i++) {
			newName += name.charAt(i);
		}
    	
		return newName;
    }
    

	@Override
	public String toString() {
		return "Composite [hijos=" + hijos + "]";
	}
    
}