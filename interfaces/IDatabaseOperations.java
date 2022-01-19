package interfaces;

//import java.lang.*;
import classes.User;


public interface IDatabaseOperations
{
	public abstract void insertUser(User u);
	void removeUser(User u);
	void showAllUser();
}