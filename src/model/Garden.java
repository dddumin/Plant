package model;

import java.util.Arrays;

public class Garden {
    private Plant[] plants;
    private int index;

    public Garden(int n) {
        this.plants = new Plant[n];
    }

    public boolean add(Plant plant) {
        if (this.index == this.plants.length)
            return false;
        this.plants[this.index++] = plant;
        return true;
    }

    public Plant get(int index) {
        if (index >= this.index && index < 0)
            return null;
        return this.plants[index];
    }

    public int count() {
        return this.index;
    }

    public Plant search(String name) {
        for (int i = 0; i < this.index; i++) {
            if (plants[i].getName().equals(name))
                return plants[i];
        }
        return null;
    }

    public int search(Plant other) {
        for (int i = 0; i < this.index; i++) {
            if (this.plants[i].equals(other))
                return i;
        }
        return -1;
    }

    public Plant delete(String name) {
        Plant p = search(name);
        int i = search(p);
        if (i == -1)
            return null;
        for (int j = i; j < this.index - 1; j++) {
            this.plants[j] = this.plants[j + 1];
        }
        this.index--;
        return p;
    }

    public boolean delete(Plant plant) {
        int i = search(plant);
        if (i == -1)
            return false;
        for (int j = i; j < this.index - 1; j++) {
            this.plants[j] = this.plants[j + 1];
        }
        this.index--;
        return true;
    }

    public boolean insert(int i, Plant plant) {
        if (i >= this.plants.length || i < 0 || this.index == this.plants.length)
            return false;
        for (int j = this.index; j > i; j--) {
            this.plants[j] = this.plants[j - 1];
        }
        index++;
        this.plants[i] = plant;
        return true;
    }

    public String string() {
        String s = "";
        for (Plant plant : this.plants) {
            s += plant + "\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garden garden = (Garden) o;
        return Arrays.equals(plants, garden.plants);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(plants);
    }

    @Override
    public String toString() {
        return "Garden{" +
                "plants=" + Arrays.toString(plants) +
                '}';
    }
}
