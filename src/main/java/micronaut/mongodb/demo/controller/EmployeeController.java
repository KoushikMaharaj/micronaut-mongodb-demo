package micronaut.mongodb.demo.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import micronaut.mongodb.demo.pojo.Employee;
import micronaut.mongodb.demo.repository.EmpoyeeRepository;

@Controller("/emp")
public class EmployeeController {
    @Inject
    EmpoyeeRepository empoyeeRepository;

    @Post
    public HttpResponse add(@Body Employee employee) {
        return HttpResponse.created(empoyeeRepository.save(employee));
    }

    @Get
    public HttpResponse findAll() {
        return HttpResponse.ok(empoyeeRepository.findAll());
    }
}
