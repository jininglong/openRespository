@Controller
public class UserController{
  
  @RequestMapping("/")
  public String toLogin(){
    return "toLogin";
    
    
  }
}
