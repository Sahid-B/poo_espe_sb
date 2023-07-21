class MetodosDePago {
    // Método para calcular el bono de docente
    public double calcularBono(Personal empleado, double bonus) {
        double bonoMeritocracia = empleado.calcularBono();
        return bonoMeritocracia + (bonus * empleado.calcularSueldoBase());
    }

    // Método para calcular el bono de administrativo
    public double calcularBono(Administrativo administrativo, double bonus) {
        double bonoMeritocracia = administrativo.calcularBono();
        return bonoMeritocracia + (bonus * administrativo.calcularSueldoBase());
    }

    // Método para calcular el bono de limpieza
    public double calcularBono(Limpieza limpieza, double bonus) {
        double bonoMeritocracia = limpieza.calcularBono();
        return bonoMeritocracia + (bonus * limpieza.calcularSueldoBase());
    }

    // Método para calcular el bono de técnico
    public double calcularBono(Tecnico tecnico, double bonus) {
        double bonoMeritocracia = tecnico.calcularBono();
        return bonoMeritocracia + (bonus * tecnico.calcularSueldoBase());
    }
}
