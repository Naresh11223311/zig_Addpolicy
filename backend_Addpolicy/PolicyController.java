package com.example.demo;
import lombok.AllArgsConstructor;
import com.example.demo.PolicyDto;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.Policy;
import com.example.demo.PolicyRepository;
import com.example.demo.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/policies")
public class PolicyController {

	 @Autowired
    private PolicyService PolicyService;

    @GetMapping
    public ResponseEntity<List<PolicyDto>> getAllPolicy(){
        List<PolicyDto> Policy = PolicyService.getAllPolicy();
        return ResponseEntity.ok(Policy);
    }

    // build create employee REST API
    @PostMapping
    public ResponseEntity<PolicyDto> createPolicy(@RequestBody PolicyDto policy) {
        PolicyDto policyDto = PolicyService.createPolicy(policy);
        return new ResponseEntity<>(policyDto, HttpStatus.CREATED);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<PolicyDto> getPolicyById(@PathVariable("id") Long policyId){
        PolicyDto policy = PolicyService.getPolicyById(policyId);
        return ResponseEntity.ok(policy);
    }

    }