abstract class Metal {
    public abstract int getEndurance();
}

class Steel extends Metal {
    @Override
    public int getEndurance() {
        return 50;
    }
}

class Copper extends Metal {
    @Override
    public int getEndurance() {
        return 20;
    }
}

class Iron extends Metal {
    @Override
    public int getEndurance() {
        return 30;
    }
}

class Plastic {
    // Класс Plastic не наследуется от Metal
}

class Sword<T extends Metal> {
    private T material;

    public Sword(T material) {
        this.material = material;
    }

    public boolean checkEndurance() {
        return material.getEndurance() > 49;
    }
}


