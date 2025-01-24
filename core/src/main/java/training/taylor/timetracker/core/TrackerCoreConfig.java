package training.taylor.timetracker.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest // This loads the application context
public class TrackerTest {

    @Autowired
    private List<TimeEntry> timesheet;

    @Test
    public void testAdd() {
        assertNotNull(timesheet, "The timesheet bean should not be null");
    }
}
