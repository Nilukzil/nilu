import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean (name="login")
@SessionScoped
public class login {
     
    private String username1;
    private String password;


	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Now you've logged in!" + username1) );
        return "/mainPage.html";
     
       // context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
    }
}