import static org.mockito.Mockito.verify;
import org.junit.*;
import org.mockito.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import controller.Controller;
import repository.Dbops;

@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {
	
	@InjectMocks
	Controller projectController;
	
	@Mock
	Dbops dbops;
	
	@Test
	public void findAllCompanyTest1() {
		projectController.getAll();
		verify(dbops).findAll();
	}
}