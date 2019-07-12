package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> employeeNames = new ArrayList<String>();	//#1

employeeNames.add("Justin Small");	//#4
employeeNames.add("Jamie Smith");
employeeNames.add("Ben Young");
employeeNames.add("William Jefferson");
employeeNames.add("Shannon Monroe");

Set<Integer> ids = new HashSet<Integer>();	//#2

ids.add(2007954);	//#4
ids.add(1006514);
ids.add(3107653);
ids.add(2377890);
ids.add(2978562);

Map<Integer, String> employeeMap = new HashMap<Integer, String>();	//#3

int i = 0;	//#5
for(Integer id: ids) {
	employeeMap.put(id, employeeNames.get(i++));
}
for(Integer key: ids) {	//#6
	employeeMap.keySet();
	employeeMap.get(key);
}
System.out.println(employeeMap);

StringBuilder idsBuilder = new StringBuilder();	//#7

for(int id: ids) {	//#8
idsBuilder.append(id + "-");
		}
System.out.println(idsBuilder.toString());	//#9

StringBuilder namesBuilder = new StringBuilder();	//#10

for(String name: employeeNames) {	//#11
namesBuilder.append(name + " ");
		}
System.out.println(namesBuilder.toString());	//#12
	}
}
