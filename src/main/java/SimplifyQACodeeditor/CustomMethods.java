package SimplifyQACodeeditor;

import com.simplifyqa.customMethod.SqaAutowired;
import com.simplifyqa.sqadrivers.webdriver;

public class CustomMethods {

	@SqaAutowired
	public Object demo_object;

    public boolean abcd(){
        webdriver.click();
        return true;
    }

}

