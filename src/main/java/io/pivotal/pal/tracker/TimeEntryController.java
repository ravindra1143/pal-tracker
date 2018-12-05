package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Time;
import java.util.List;

public class TimeEntryController {



    public TimeEntryController(TimeEntryRepository timeEntryRepository){

    }

    @PostMapping("/time-entries")
    public ResponseEntity create(@RequestBody TimeEntry timeEntryToCreate) {
        //ResponseEntity<TimeEntry> response= null;
        InMemoryTimeEntryRepository inTimeRepo = new InMemoryTimeEntryRepository();
        TimeEntry te = inTimeRepo.create(timeEntryToCreate);
        return new ResponseEntity<>(te, HttpStatus.OK);
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        ResponseEntity<TimeEntry> response= null;
        return response;
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        ResponseEntity response = null;
        return response;
    }

    public ResponseEntity<TimeEntry> delete(long timeEntryId) {
        ResponseEntity<TimeEntry> response= null;
        return response;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        ResponseEntity<List<TimeEntry>> response= null;
        return response;
    }
}
