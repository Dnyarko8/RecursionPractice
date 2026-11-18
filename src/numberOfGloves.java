
public int numberOfGloves(int peopleOfPlanetU101InARoom) {
    if (peopleOfPlanetU101InARoom == 0) {
        return 0;
    }

    return 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
}

void main() {
}
