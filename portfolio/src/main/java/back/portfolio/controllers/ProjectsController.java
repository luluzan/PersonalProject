package back.portfolio.controllers;

import back.portfolio.models.projects;
import back.portfolio.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personalprjct/projects")
public class ProjectsController {
    private final ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping
    @ResponseBody
    public List<projects> getAllProjects() {

        return projectsService.getAllProjects();
    }

}
