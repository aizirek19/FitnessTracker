package com.example.fittracker.controller;

import com.example.fittracker.dto.ActivityDTO;
import com.example.fittracker.services.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping("/activity")
    public ResponseEntity<?> postActivity(@RequestBody ActivityDTO dto) {
        ActivityDTO createActivity = activityService.postActivity(dto);

        if (createActivity != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createActivity);
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong. ");
        }
    }

    @GetMapping("/activities")
    public ResponseEntity<?> getActivities() {
        try {
            return ResponseEntity.ok(activityService.getActivities());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong. ");
        }
    }
    @PutMapping("/activity/{id}")
    public ResponseEntity<?> updateActivity(@PathVariable Long id, @RequestBody ActivityDTO dto) {
        try {
            return ResponseEntity.ok(activityService.updateActivity(id, dto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/activity/{id}")
    public ResponseEntity<?> deleteActivity(@PathVariable Long id) {
        try {
            activityService.deleteActivity(id);
            return ResponseEntity.ok("Activity deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}