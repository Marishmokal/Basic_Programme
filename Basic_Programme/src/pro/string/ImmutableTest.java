package pro.string;

import java.util.Collections;
import java.util.List;

/**
 * for immutable field
 * @author Shree
 *steps to create immutable class
 *step 1:decleare class as final
 *step 2:decleare variables as private and final
 *step 3:remove setters 
 *this 3 steps are enough if our object doesnt contain any mutable field
 *if object contains mutables fields
 *step 4:we have to perform deep copy of mutable field 
 */
public final class ImmutableTest {

	
	private final String name;
	private final int roll;
	private final List<Integer>phones;
	private ImmutableTest(String name, int roll, List<Integer> phones) {
		super();
		this.name = name;
		this.roll = roll;
		this.phones=Collections.unmodifiableList(phones);
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public List<Integer> getPhones() {
		return phones;
	}
	
	
	
}
