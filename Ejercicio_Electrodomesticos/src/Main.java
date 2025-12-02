//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Lavadora lavadoraAEG = new Lavadora(400, Colores.plateado, "PK", 30, 7);
    System.out.printf("La lavadora cuesta: %s%n", lavadoraAEG.precioFinal());
    Television tvSamsung = new Television(190, Colores.negro, "A+", 10, 24, true);
    System.out.printf("La tele cuesta: %s%n", tvSamsung.precioFinal());
}

