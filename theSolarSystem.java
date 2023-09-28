package thesolarsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий звезду.
 */
class Star {
    private final String name;
    /**
     * Конструктор для создания объекта звезды.
     *
     * @param name Название звезды.
     */
    public Star(String name) {
        this.name = name;
    }
    /**
     * Получить название звезды.
     *
     * @return Название звезды.
     */
    public String getName() {
        return name;
    }
}
/**
 * Класс, представляющий луну.
 */
class Moon {
    private final String name;
    /**
     * Конструктор для создания объекта луны.
     *
     * @param name Название луны.
     */
    public Moon(String name) {
        this.name = name;
    }
    /**
     * Получить название луны.
     *
     * @return Название луны.
     */
    public String getName() {
        return name;
    }
}
/**
 * Класс, представляющий планету.
 */
class Planet {
    private final String name;
    /**
     * Конструктор для создания объекта планеты.
     *
     * @param name Название планеты.
     */
    public Planet(String name) {
        this.name = name;
    }
    /**
     * Получить название планеты.
     *
     * @return Название планеты.
     */
    public String getName() {
        return name;
    }
}
/**
 * Класс, представляющий звездную систему.
 */
class StarSystem {
    private final Star star;
    private final Moon moon;
    private final List<Planet> planets;
    /**
     * Конструктор для создания объекта звездной системы.
     *
     * @param star Звезда в системе.
     * @param moon Луна в системе.
     */
    public StarSystem(Star star, Moon moon) {
        this.star = star;
        this.moon = moon;
        this.planets = new ArrayList<>();
    }
    /**
     * Получить название луны в системе.
     *
     * @return Название луны.
     */
    public String getNameMoon() {
        return moon.getName();
    }
    /**
     * Получить название звезды в системе.
     *
     * @return Название звезды.
     */
    public String getNameStar() {
        return star.getName();
    }
    /**
     * Добавить планету в систему.
     *
     * @param planet Планета для добавления.
     */
    public void addPlanet(Planet planet) {
        planets.add(planet);
    }
    /**
     * Получить количество планет в системе.
     *
     * @return Количество планет.
     */
    public int getPlanetCount() {
        return planets.size();
    }
}

public class TheSolarSystem {

    public static void main(String[] args) {
        Star sun;
        Moon moon;
        Planet earth, mars;

        sun = new Star("Солнце");
        moon = new Moon("Луна");
        earth = new Planet("Земля");
        mars = new Planet("Марс");

        StarSystem solarSystem;
        solarSystem = new StarSystem(sun, moon);

        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);

        System.out.println("Название звезды: " + solarSystem.getNameStar());
        System.out.println("Название луны: " + solarSystem.getNameMoon());
        System.out.println("Число планет в солнечной системе: " + solarSystem.getPlanetCount());
    }
}
