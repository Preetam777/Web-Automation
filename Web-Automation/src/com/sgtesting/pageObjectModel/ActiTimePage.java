package com.sgtesting.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

	//CreateUser Taskbar
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUsers;
	public WebElement getCreateUser()
	{
		return oUsers;
	}


	// Add user button
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
	}

	// FirstName for 1st user
	private WebElement firstName;
	public WebElement getFN()
	{
		return firstName;
	}

	// LastName for  user
	private WebElement lastName;
	public WebElement getLN()
	{
		return lastName;
	}
	// Email for  user
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}

	//UserName for user
	private WebElement userDataLightBox_usernameField;
	public WebElement getUN()
	{
		return userDataLightBox_usernameField;
	}

	// Password for user1
	private WebElement userDataLightBox_passwordField;
	public WebElement getPSWD()
	{
		return userDataLightBox_passwordField;
	}

	//ReType  Password for user1
	private WebElement userDataLightBox_passwordCopyField ;
	public WebElement getRe_PSWD()
	{
		return userDataLightBox_passwordCopyField;
	}

	// user commit button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement commitbutton;
	public WebElement getUsercommitButton()
	{
		return commitbutton;
	}
	
	//Delete task Bar
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement deleteTaskBar;
	public WebElement getdeleteTakBar()
	{
		return deleteTaskBar;
	}
	
	// Delete user1
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//Modify user1
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement modifyTaskBar;
	public WebElement getmodifyTaskBar()
	{
		return modifyTaskBar;
	}
	
	//Create customer1
	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a")
	private WebElement Task;
	public WebElement getTask()
	{
		return Task;
	}
	
	//Add customer and project button
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")
	private WebElement addNewButton;
	public WebElement getaddNewButton()
	{
		return addNewButton;
	}
	
	// create new customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement createNewCustomer ;
	public WebElement getcreateNewCustomer()
	{
		return createNewCustomer;
	}
	
	//create new customer page
	@FindBy(xpath="//*[@id='customerLightBox_nameField']")
	private WebElement customerLightBox_nameField;
	public WebElement getEnterCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	//add customer description
	@FindBy(xpath="//*[@id='customerLightBox_descriptionField']")
	private WebElement customerLightBox_descriptionField;
	public WebElement getCustomerDescription()
	{
		return customerLightBox_descriptionField;
	}
	
	// create customer commitbutton
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']")
	private WebElement CustomerCommitButton;
	public WebElement getCustomerCommitBtn()
	{
		return  CustomerCommitButton;
	}
	
	// delete customer edit*button
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editButton;
	public WebElement geteditButton1()
	{
		return editButton;
	}
	
	//delete customer Action button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actionButton;
	public WebElement getactionButton1()
	{
		return actionButton;
	}
	
	//delete customer check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement DeleteCheckBox;
	public WebElement getDeleteCheckBox1()
	{
		return DeleteCheckBox;
	}
	
	//delete customer title button
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
	private WebElement DeletePermanently;
	public WebElement getDeletePermanently1()
	{
		return DeletePermanently;
	}
	
	//New project tab
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement creatNewProject;
	public WebElement getcreatNewProject()
	{
		return creatNewProject;
	}
	
	//Enter Project name
	@FindBy(xpath="//*[@id='projectPopup_projectNameField']")
	private WebElement projectNameField;
	public WebElement getprojectNameField()
	{
		return projectNameField;
	}
	
	//customer selection field
	@FindBy(xpath="//*[@id='ext-gen50']/td[2]")
	private WebElement customerSelectionField;
	public WebElement getcustomerSelectionField()
	{
		return customerSelectionField;
	}
	
	//Add project description field
	@FindBy(xpath="//*[@id='projectPopup_projectDescriptionField']")
	private WebElement add_projectDescriptionField;
	public WebElement getadd_projectDescriptionField()
	{
		return add_projectDescriptionField;
	}
	
	//creat project commit button
	@FindBy(xpath="//*[@id='projectPopup_commitBtn']")
	private WebElement projectPopup_commitBtn;
	public WebElement getprojectPopup_commitBtn()
	{
		return projectPopup_commitBtn;
	}
	
	//after mofidy delete cross button [X]
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement clossButton;   
	public WebElement getcloseButton()
	{
		return clossButton;
	}
	
	// Delete project *button
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement deleteeditButton;
	public WebElement getdeleteeditButton()
	{
		return deleteeditButton;
	}
	
	//Delete project action button
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deleteActionButton;
	public WebElement getdeleteActionButton()
	{
		return deleteActionButton;
	}
	
	//Delete project delete checkbox[]
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteProjectCheckBox;
	public WebElement getdeleteProjectCheckBox()
	{
		return deleteProjectCheckBox;
	}
	
	//Delete Project confirmation button
	@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitTitle']")
	private WebElement deleteConfirm_submitTitle;
	public WebElement getdeleteConfirm_submitTitle()
	{
		return deleteConfirm_submitTitle;
	}
	
	//modify project description box
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projectDescriptionBox;
	public WebElement getprojectDescriptionBox()
	{
		return projectDescriptionBox;
	}
	
	//modify project editbutton *
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectEditButton;
	public WebElement getprojectEditButton()
	{
		return projectEditButton;
	}
	
	//modify project close button [x]
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement projectcloseBtn;
	public WebElement getprojectcloseBtn()
	{
		return projectcloseBtn;
	}
	
	//create task AddTask button
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")
	private WebElement AddNewTask_Btn;
	public WebElement getAddNewTask_Btn()
	{
		return AddNewTask_Btn;
		
	}
	
	// create new task button
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createNewTask_Btn;
	public WebElement getcreateNewTask_Btn()
	{
		return createNewTask_Btn;
	}
	
	// create task select customer
	@FindBy(xpath="//*[@id='ext-gen23']")
	private WebElement selectCustomer;
	public WebElement getselectCustomer()
	{
		return selectCustomer;
	}
	
	//create task name enter task
	@FindBy(xpath="//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement createTasksTableContainer;
	public WebElement getcreateTasksTableContainer()
	{
		return createTasksTableContainer;
	}
	
	//create task name check box[]
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")
	private WebElement taskCheckBox;
	public WebElement gettaskCheckBox()
	{
		return taskCheckBox;
	}
	
	//create task commit button
	@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]")
	private WebElement createTasksPopup_commitBtn;
	public WebElement getcreateTasksPopup_commitBtn()
	{
		return createTasksPopup_commitBtn;
	}
	
	// delete task check box
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
	private WebElement deleteTaskCheckBox;
	public WebElement getdeleteTaskCheckBox()
	{
		return deleteTaskCheckBox;
	}
	
	//delete task delete button
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")
	private WebElement deleteTeskbtn;
	public WebElement getdeleteTeskbtn()
	{
		return deleteTeskbtn;
	}
	
	// delete Task Popup window ok button
	@FindBy(xpath="//*[@id='deleteTaskPopup_deleteConfirm_submitBtn']")
	private WebElement deleteConfirm_submitBtn;
	public WebElement getdeleteConfirm_submitBtn()
	{
		return deleteConfirm_submitBtn;
	}
	
	//delete Task 
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement DeleteTask1;
	public WebElement getDeleteTask1()
	{
		return DeleteTask1;
	}
	
	//delete Task Action button
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement DeleteTaskActionBtn;
	public WebElement getDeleteTaskActionBtn()
	{
		return DeleteTaskActionBtn;
	}
	
	//delete Task Delete Check Box
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")
	private WebElement DeleteTaskDeleteCheckBox;
	public WebElement getDeleteTaskDeleteCheckBox()
	{
		return  DeleteTaskDeleteCheckBox;
	}
	
	// delete Task permonently button
	@FindBy(xpath="//*[@id='taskPanel_deleteConfirm_submitTitle']")
	private WebElement TaskdeleteConfirm_submitTitle;
	public WebElement getTaskdeleteConfirm_submitTitle()
	{
		return TaskdeleteConfirm_submitTitle;
	}
	
	
	
	
}





