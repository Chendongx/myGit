package com.example.demp.controller;

import com.example.demp.pojo.Boy;
import com.example.demp.unknown.BoyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author cdx
 */
@RestController
@Transactional
public class BoyController {

    @Autowired
    private BoyRespository boyRespository;

    @GetMapping(value = "/boy")
    public List<Boy> findAll() {
        return boyRespository.findAll();
    }

    @PostMapping(value = "/boy")
    public Boy addBoy(@RequestParam("name") String name,@RequestParam("sex")String sex ) {
        Boy boy = new Boy();
        boy.setName(name);
        boy.setSex(sex);
        return boyRespository.save(boy);
    }

    @GetMapping(value = "/boy/{id}")
    public Optional<Boy> findOne(@PathVariable Integer id){
        return boyRespository.findById(id);
    }

    @PutMapping(value = "/boy/{id}")
    public Boy updBoy(@PathVariable("id") Integer id,
                      @RequestParam(value = "name", required = true) String name,
                      @RequestParam(value = "sex", required = true) String sex) {
        Boy boy = new Boy();
        boy.setId(id);
        boy.setName(name);
        boy.setSex(sex);
        return boyRespository.save(boy);
    }

    @DeleteMapping(value = "/boy/{id}")
    public String delBoy(@PathVariable Integer id){
        boyRespository.deleteById(id);
        Optional<Boy> boy = boyRespository.findById(id);
        String result = "删除成功";
        if (boy.isPresent()){
            result = "删除失败";
        }
        return result;
    }
}
