import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean (name="mainPage")
@SessionScoped
public class mainPage {
	
	public boolean bacon;
	public boolean pancakes;
	public boolean potatoes;
	public boolean beans;
	public boolean toast;
	public boolean eggs;
	
	  
  

	public boolean isBacon() {
		return bacon;
	}


	public void setBacon(boolean bacon) {
		this.bacon = bacon;
	}


	public boolean isPancakes() {
		return pancakes;
	}


	public void setPancakes(boolean pancakes) {
		this.pancakes = pancakes;
	}


	public boolean isPotatoes() {
		return potatoes;
	}


	public void setPotatoes(boolean potatoes) {
		this.potatoes = potatoes;
	}


	public boolean isBeans() {
		return beans;
	}


	public void setBeans(boolean beans) {
		this.beans = beans;
	}


	public boolean isToast() {
		return toast;
	}


	public void setToast(boolean toast) {
		this.toast = toast;
	}


	public boolean isEggs() {
		return eggs;
	}


	public void setEggs(boolean eggs) {
		this.eggs = eggs;
	}


	public void buttonActionBacon(ActionEvent actionEvent) {
        addMessage("You chose Bacon!");
    }
    
	  
    public void buttonActionPancakes(ActionEvent actionEvent) {
        addMessage("You chose Pancake!");
    }
    
	  
    public void buttonActionPotatoes(ActionEvent actionEvent) {
        addMessage("You chose Potatoes!");
    }
    
	  
    public void buttonActionBeans(ActionEvent actionEvent) {
        addMessage("You chose Beans!");
    }
     
    
    public void buttonActionToast(ActionEvent actionEvent) {
        addMessage("You chose Toast!");
    }
    
    public void buttonActionEggs(ActionEvent actionEvent) {
        addMessage("You chose Eggs!");
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}