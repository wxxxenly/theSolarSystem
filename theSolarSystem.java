package thesolarsystem;

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
 * Класс, представляющий звездную систему.
 */
class StarSystem {
    private final Star star;
    private final Moon moon;
    private final Planet[] planets; // Используем массив для хранения планет

    /**
     * Конструктор для создания объекта звездной системы.
     *
     * @param star Звезда в системе.
     * @param moon Луна в системе.
     */
    public StarSystem(Star star, Moon moon) {
        this.star = star;
        this.moon = moon;
        this.planets = new Planet[10]; // Создаем массив для хранения до 10 планет
    }

    /**
     * Получить название звезды в системе.
     *
     * @return Название звезды.
     */
    public void getNameStar() {
        System.out.println("Название звезды: " + star.getName());
    }

    /**
     * Добавить планету в систему.
     *
     * @param planet Планета для добавления.
     */
    public void addPlanet(Planet planet) {
        for (int i = 0; i < planets.length; i++) {
            if (planets[i] == null) { // Ищем первый свободный слот в массиве
                planets[i] = planet; // Добавляем планету в массив
                break; // Выходим из цикла после добавления
            }
        }
    }
    
    /**
     * Получить количество планет в системе.
     *
     * @return Количество планет.
     */
    public void printPlanet() {
        int count = 0;
        for (Planet planet : planets) {
            if (planet != null) {
                count++;
            } else {
                break; // После последней планеты выходим из цикла
            }
        }
        System.out.println("Количество планет в системе: " + count);
    }

    /**
     * Получить название луны в системе.
     *
     * @return Название луны.
     */
    public String getNameMoon() {
        return moon.getName();
    }
}

public class TheSolarSystem {

    public static void main(String[] args) {
        Star sun;
        Moon moon;
        Planet earth, mars, jupiter, saturn;

        sun = new Star("Солнце");
        moon = new Moon("Луна");

        earth = new Planet("Земля");
        mars = new Planet("Марс");
        jupiter = new Planet("Юпитер");
        saturn = new Planet("Сатурн");

        StarSystem solarSystem;
        solarSystem = new StarSystem(sun, moon);

        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(jupiter);
        solarSystem.addPlanet(saturn);
        solarSystem.printPlanet();
        solarSystem.getNameStar();

        System.out.println("Спутник: " + solarSystem.getNameMoon());
    }
}
