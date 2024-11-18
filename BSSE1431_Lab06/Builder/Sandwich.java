package BSSE1431_Lab06.Builder;

public class Sandwich {

    private String bread;
    private String filling;
    private String spread;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.filling = builder.filling;
        this.spread = builder.spread;
    }

    public String getBread() {
        return bread;
    }

    public String getFilling() {
        return filling;
    }

    public String getSpread() {
        return spread;
    }

    @Override
    public String toString() {
        return "Sandwich [Bread=" + bread + ", Filling=" + filling + ", Spread=" + spread + "]";
    }

    public static class Builder {
        private String bread;
        private String filling;
        private String spread;

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setFilling(String filling) {
            this.filling = filling;
            return this;
        }

        public Builder setSpread(String spread) {
            this.spread = spread;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
