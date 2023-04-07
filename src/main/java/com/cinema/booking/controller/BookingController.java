package com.cinema.booking.controller;

import com.cinema.booking.model.Ticket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path="/cinema")
public class BookingController {
    List<Ticket> ticketList = new ArrayList<>();
   Logger log = LogManager.getLogger(BookingController.class);
    @PostMapping(path="/tickets")
    public Ticket addTicket(@RequestBody Ticket ticket){
        log.info("controller called");
        ticketList.add(ticket);
        return  ticket;
    }


    @GetMapping (path="/tickets")
    public List<Ticket> getTickets(){
        return  ticketList;
    }


    @DeleteMapping (path="/tickets/{ticketId}")
    public String deleteTicket(@PathVariable String ticketId){
        return ticketId  + "  removed successfully";

    }
}
