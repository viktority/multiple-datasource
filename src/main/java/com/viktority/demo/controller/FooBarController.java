/*
 * package com.viktority.demo.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.foobar.bar.repo.CourseCategoriesRepository; import
 * com.foobar.bar.repo.CourseGroupCategoriesRepository; import
 * com.foobar.foo.repo.FooRepository; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * @RestController
 * 
 * @RequestMapping("test/doubledb") public class FooBarController {
 * 
 * private final FooRepository fooRepo; private final CourseCategoriesRepository
 * ccr; private final CourseGroupCategoriesRepository cgcr;
 * 
 * @Autowired FooBarController(FooRepository fooRepo, CourseCategoriesRepository
 * ccr, CourseGroupCategoriesRepository cgcr) { this.fooRepo = fooRepo; this.ccr
 * = ccr; this.cgcr = cgcr; }
 * 
 * // @RequestMapping("/foobar/{id}") // public String
 * fooBar(@PathVariable("id") Long id) { // Foo foo = fooRepo.findById(id); //
 * CourseCategories bar = ccr.findById(id); // // return foo.getFoo() + " " +
 * bar.getBar() + "!"; // }
 * 
 * @GetMapping(path = "/allsub") public ResponseEntity allsub() {
 * 
 * return ResponseEntity.ok(ccr.findAll()); }
 * 
 * @GetMapping(path = "/allfoo") public ResponseEntity allfoo() {
 * 
 * return ResponseEntity.ok(fooRepo.findAll()); }
 * 
 * @GetMapping(path = "/all") public ResponseEntity all() {
 * 
 * return ResponseEntity.ok(cgcr.findAll()); }
 * 
 * }
 */