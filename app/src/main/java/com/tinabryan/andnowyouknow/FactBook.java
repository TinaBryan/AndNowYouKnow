package com.tinabryan.andnowyouknow;

import java.util.Random;

/**
 * Created by tinabryan on 11/27/15.
 */
public class FactBook {

    // Member variables (properties about the object)
    public String[] mFacts = {
            "Hubble telescope delivers the deepest images of the universe ever recorded.",
            "Hubble Telescope only takes pictures in shades of black and white.",
            "Andromeda is hundreds of thousands of light years away form our Milky Way.",
            "The Hubble Telescope is named after American astronomer, Edwin Hubble.",
            "Hubble's images are colored from pairing a color with a wavelength of light.",
            "Hubble technology is saving lives through better breast cancer detection.",
            "Anyone can make a request to use the Hubble Telescope.",
            "Hubble Telescope will be replaced by the James Webb Space Telescope.",
            "The Hubble Telescope is perched at an altitude of only 350 miles.",
            "The James Webb Telescope will be placed 1 million miles beyond the Moon.",
            "The James Webb Telescope is set to launch in 2018.",
            "The Sun is over 300,000 times larger than Earth.",
            "Neptune is the most distant planet in our solar system.",
            "Neptune is the eighth planet from the Sun.",
            "Neptune has 14 moons, 5 rings, and surface temperature is -201°Celsius.",
            "Pluto is the second closest dwarf planet to the Sun.",
            "Pluto has 5 moons; Charon, Nix, Hydra, Kerberos, and Styx.",
            "The surface temperature of Pluto is: -229°Celsius.",
            "Uranus is the seventh planet from the Sun.",
            "Uranus has 27 moons, notable: Oberon, Titania, Miranda, Ariel, and Umbriel.",
            "The surface temperature of Uranus is: -197°Celsius",
            "Uranus was discovered by William Herschel, Mar. 13, 1781.",
            "Pluto was discovered by Clyde W. Tombaugh, Feb. 18, 1930.",
            "Neptune was discovered by Urbain Le Verrier & Johann Galle Sept. 23, 1846.",
            "Mercury is the closest planet to the Sun.",
            "Mercury does not have any known moons.",
            "Mercury has a surface temperature of -173°Celsius to 427°Celsius",
            "mercury was recorded by: Assyrian astronomers.",
            "Venus is the second planet from the Sun.",
            "Venus does not have any known moons.",
            "The surface temperature of Venus is: 462°Celsius.",
            "Venus was recorded by: Babylonian astronomers.",
            "Earth is the third planet from the Sun.",
            "Earth has one notable moon: The Moon.",
            "The surface temperature of the Earth is: -88°Celsius to 58°Celsius.",
            "Mars is the fourth planet from the Sun.",
            "Mars has two known moons: Phobos & Deimos.",
            "The surface temperature of Mars is: -87°Celsius to -5°Celsius.",
            "Mars was recorded by: Egyptian astronomers.",
            "Jupiter is the fifth planet from the Sun.",
            "Jupiter has 67 known moons.",
            "The surface temperature of Jupiter is: -108°Celsius.",
            "Jupiter was recorded by: Babylonian astronomers.",
            "Saturn is the sixth planet from the Sun.",
            "Saturn has 62 known moons.",
            "The surface temperature of Saturn is: -139°Celsius.",
            "Saturn was recorded by: Assyrians.",
            "The Terrestrial planets are: Mercury, Venus, Earth, and Mars.",
            "Gas giants: contain 10 times the mass of Earth.",
            "Gas giants are known as: Jovian or Outer Planets.",
            "Gas giants: Jupiter, Saturn, Uranus, and Neptune."};

    // Method (abilities: things the object can do)
    public String getFact() {



        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
