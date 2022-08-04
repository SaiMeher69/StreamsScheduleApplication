package dev.meher.streamsschedule.controller;

import dev.meher.streamsschedule.exception.LiveStreamNotFoundException;
import dev.meher.streamsschedule.model.LiveStream;
import dev.meher.streamsschedule.repository.LiveStreamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    //GET http://localhost:8080/streams
    @GetMapping
    public List<LiveStream> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) throws LiveStreamNotFoundException {
        return repository.findById(id);
    }

    // POST http://localhost:8080/streams
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream){
        return repository.create(stream);
    }

    //PUT http://localhost:8080/streams/30cb0cd6-cfa5-4e54-8eb7-3ceacc8e8aac
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody LiveStream stream, @PathVariable String id){
        repository.update(stream, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        repository.delete(id);
    }

}
