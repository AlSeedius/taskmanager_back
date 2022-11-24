package so.ups.taskmanager.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import so.ups.taskmanager.dev.DAO.neo4j.CompanyRepository;
import so.ups.taskmanager.dev.DAO.neo4j.ProjectRepository;
import so.ups.taskmanager.dev.DAO.neo4j.UserRepository;
import so.ups.taskmanager.dev.entitites.neo4j.CompanyEntity;
import so.ups.taskmanager.dev.entitites.neo4j.ProjectEntity;
import so.ups.taskmanager.dev.entitites.neo4j.UserEntity;
import so.ups.taskmanager.dev.reponses.MessageResponse;
import so.ups.taskmanager.dev.requests.SignupRequest;
import so.ups.taskmanager.dev.security.jwt.JwtUtils;


@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/api/testing/")
public class TestController {
    @Autowired
    PasswordEncoder encoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtUtils jwtUtils;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/all")
    public MessageResponse allAccess() {
        return new MessageResponse("Server is up.....");
    }

    @PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
       if (userRepository.existsUserEntityByEmail(signUpRequest.getEmail())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
        }
        UserEntity user = new UserEntity(signUpRequest.getEmail(), signUpRequest.getUsername(), encoder.encode(signUpRequest.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("user registered successfully!"));
    }
    @PostMapping("/project")
    public ResponseEntity<?> addProject(@RequestBody SignupRequest signUpRequest) {
        ProjectEntity project = new ProjectEntity(signUpRequest.getUsername());
        projectRepository.save(project);
        return ResponseEntity.ok(new MessageResponse("project added successfully!"));
    }
    @PostMapping("/company")
    public ResponseEntity<?> addCompany(@RequestBody SignupRequest signUpRequest) {
        CompanyEntity company = new CompanyEntity(signUpRequest.getUsername());
        companyRepository.save(company);
        return ResponseEntity.ok(new MessageResponse("company added successfully!"));
    }
    @GetMapping("/connect")
    public ResponseEntity<?> connect(@RequestBody SignupRequest signUpRequest) {
        ProjectEntity pe = projectRepository.findProjectEntityByName(signUpRequest.getUsername());
        CompanyEntity ce = companyRepository.findCompanyEntityByName(signUpRequest.getEmail());
        ce.ConnectProject(pe);
        companyRepository.save(ce);
        return ResponseEntity.ok(new MessageResponse("connected successfully!"));
    }
}