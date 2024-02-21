package com.example.demo.Controller;


import com.example.demo.services.UpstashQueue;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/queue")
    public class QueueController {
        private final UpstashQueue upstashQueue;

        public QueueController() {

            String host = "needed-teal-31934.upstash.io";
            int port = 31934;
            String password="b04574e04ba342fc87cbf17363c6ef6b";
            this.upstashQueue = new UpstashQueue(host, port,password);
        }

        @PostMapping("/enqueue")
        public String enqueue(@RequestBody String item) {
            upstashQueue.enqueue(item);
            return  item;
        }

        @GetMapping("/dequeue")
        public String dequeue() {
            return upstashQueue.dequeue();
        }

        @GetMapping("/size")
        public long size() {
            return upstashQueue.size();
        }

        @GetMapping("/isEmpty")
        public boolean isEmpty() {
            return upstashQueue.isEmpty();
        }
    }

