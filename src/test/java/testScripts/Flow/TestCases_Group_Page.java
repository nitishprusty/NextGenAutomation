package testScripts.Flow;

import org.testng.annotations.Test;

import reusableComponents.ConstantUtils;

public class TestCases_Group_Page extends TestCases_Profile_Page{
	
	@Test(dependsOnMethods ={"Profile"})
	public void Group() throws Exception{
		
		
		scenario("TC_40: Validate if SA is able to navigate to Groups tab on click of groups");
		groupsPage.NavigatetoGroupsTab();
		
		scenario("TC_41: Validate if SA is able Edit the existing By default group and map profiles in it.");
		groupsPage.EditGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		
		scenario("TC_42: Validate if SA is able to create new Group on click of Add Group button.");
		groupsPage.AddNewGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		
		scenario("TC_43: Validate if SA is able to Copy Group using copy functionality.");
		groupsPage.CopyGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);
		  
		scenario("TC_44: Validate if SA is able to Deactivate a group and view it in Inactive tab.");
		groupsPage.DeactivateGroup(ConstantUtils.FilePath_Groups_Page, "GroupsPage", 0, 0);		
	}


}
