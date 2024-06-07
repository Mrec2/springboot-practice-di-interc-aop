package org.mario.springboot.app.springboot_app_di_inter_aop;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.mario.springboot.app.springboot_app_di_inter_aop.models.Event;
import org.mario.springboot.app.springboot_app_di_inter_aop.repositories.EventRepository;
import org.mario.springboot.app.springboot_app_di_inter_aop.repositories.EventRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("events")
    EventRepository eventRepository() {
        return new EventRepositoryImpl(Arrays.asList(
            new Event(1L, "Tech Conference 2024", "Annual technology conference", LocalDateTime.of(2024, 8, 20, 9, 0), "New York", "Tech Corp"),
            new Event(2L, "Art Expo", "Exhibition of modern art", LocalDateTime.of(2024, 7, 15, 10, 0), "Paris", "Art World"),
            new Event(3L, "Music Festival", "Three-day music festival", LocalDateTime.of(2024, 6, 10, 12, 0), "London", "Music Live"),
            new Event(4L, "Book Fair", "Annual book fair with authors", LocalDateTime.of(2024, 5, 5, 11, 0), "Berlin", "Books United"),
            new Event(5L, "Science Symposium", "Symposium on recent scientific discoveries", LocalDateTime.of(2024, 9, 10, 14, 0), "San Francisco", "Science Today"),
            new Event(6L, "Health and Wellness Expo", "Expo focused on health and wellness", LocalDateTime.of(2024, 10, 20, 9, 0), "Chicago", "Health Matters"),
            new Event(7L, "Automobile Show", "Display of new car models", LocalDateTime.of(2024, 4, 18, 10, 0), "Detroit", "Auto World"),
            new Event(8L, "Food Festival", "Celebration of culinary arts", LocalDateTime.of(2024, 3, 25, 12, 0), "Rome", "Culinary Delights"),
            new Event(9L, "Film Festival", "Screening of independent films", LocalDateTime.of(2024, 11, 8, 18, 0), "Cannes", "Indie Films"),
            new Event(10L, "Startup Pitch Event", "Pitch event for startups", LocalDateTime.of(2024, 12, 5, 14, 0), "Silicon Valley", "Startup Hub"),
            new Event(11L, "Fashion Show", "Showcase of new fashion lines", LocalDateTime.of(2024, 8, 10, 19, 0), "Milan", "Fashion Forward"),
            new Event(12L, "Gaming Convention", "Convention for gaming enthusiasts", LocalDateTime.of(2024, 7, 20, 15, 0), "Tokyo", "Game On"),
            new Event(13L, "Environmental Summit", "Summit on environmental issues", LocalDateTime.of(2024, 6, 30, 9, 0), "Sydney", "Eco Friendly"),
            new Event(14L, "Literary Workshop", "Workshop for budding writers", LocalDateTime.of(2024, 5, 25, 13, 0), "Dublin", "Write Now"),
            new Event(15L, "Photography Expo", "Exhibition of photographic works", LocalDateTime.of(2024, 4, 15, 11, 0), "Barcelona", "Photo World"),
            new Event(16L, "History Conference", "Conference on historical events", LocalDateTime.of(2024, 3, 20, 10, 0), "Athens", "History Today"),
            new Event(17L, "Robotics Workshop", "Workshop on robotics technology", LocalDateTime.of(2024, 2, 10, 14, 0), "Boston", "Robotics Future"),
            new Event(18L, "Astronomy Night", "Stargazing and astronomy talks", LocalDateTime.of(2024, 1, 30, 18, 0), "Cape Town", "Star Gazers"),
            new Event(19L, "Wine Tasting Event", "Event for wine enthusiasts", LocalDateTime.of(2024, 11, 15, 16, 0), "Napa Valley", "Wine Lovers"),
            new Event(20L, "Charity Gala", "Gala event for charity", LocalDateTime.of(2024, 12, 25, 20, 0), "Los Angeles", "Give Back"),
            new Event(21L, "Sports Meet", "Athletic competition", LocalDateTime.of(2024, 10, 10, 9, 0), "Rio de Janeiro", "Sports United"),
            new Event(22L, "Craft Fair", "Fair for handmade crafts", LocalDateTime.of(2024, 9, 20, 11, 0), "Edinburgh", "Crafts People"),
            new Event(23L, "Investment Seminar", "Seminar on investment strategies", LocalDateTime.of(2024, 8, 5, 14, 0), "Zurich", "Invest Smart"),
            new Event(24L, "Yoga Retreat", "Retreat focusing on yoga practices", LocalDateTime.of(2024, 7, 18, 9, 0), "Bali", "Yoga Life"),
            new Event(25L, "Tech Meetup", "Meetup for tech enthusiasts", LocalDateTime.of(2024, 6, 12, 17, 0), "Austin", "Tech Connect"),
            new Event(26L, "Cultural Festival", "Festival celebrating cultures", LocalDateTime.of(2024, 5, 22, 12, 0), "Istanbul", "Cultural Harmony"),
            new Event(27L, "Architecture Tour", "Tour of architectural landmarks", LocalDateTime.of(2024, 4, 8, 10, 0), "Dubai", "Arch Wonders"),
            new Event(28L, "Entrepreneurship Bootcamp", "Bootcamp for entrepreneurs", LocalDateTime.of(2024, 3, 5, 9, 0), "Singapore", "Entrepreneur Edge"),
            new Event(29L, "Coding Hackathon", "Hackathon for coders", LocalDateTime.of(2024, 2, 15, 8, 0), "Bangalore", "CodeFest"),
            new Event(30L, "Holiday Market", "Market for holiday goods", LocalDateTime.of(2024, 1, 5, 11, 0), "Vienna", "Holiday Bazaar")
        ));
    }
}
