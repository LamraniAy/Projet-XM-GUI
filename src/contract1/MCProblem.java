package contract1;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class MCProblem {

	// Create a set of Alternative objects
	protected Set <Alternative> alternatives = new HashSet <Alternative> ();
	
	// Create a set of Criterion objects
	protected Set <Criterion> criteria = new HashSet <Criterion> ();
	
	protected Table<Alternative, Criterion, Double> tableEval = HashBasedTable.create();
	
	public MCProblem(Alternative alt, Criterion c, Double val){
		this.alternatives.add(alt);
		this.criteria.add(c);
		tableEval.put(alt, c,val);
	}
	
	
	
}