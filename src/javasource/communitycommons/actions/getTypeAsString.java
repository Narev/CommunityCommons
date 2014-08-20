// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Returns the actual type of an Entity. Useful as alternative way to split upon inheritance, or as input of other functions in this module.
 */
public class getTypeAsString extends UserAction<String>
{
	private IMendixObject instance;

	public getTypeAsString(IMendixObject instance)
	{
		super();
		this.instance = instance;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (instance == null)
			return "";
		return instance.getType();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getTypeAsString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
