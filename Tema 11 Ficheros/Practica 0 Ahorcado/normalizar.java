    public static String normalizar(String palabraSeleccionada) {
        palabraSeleccionada = Normalizer.normalize(palabraSeleccionada, Normalizer.Form.NFD);
        palabraSeleccionada = palabraSeleccionada.replaceAll("[\u0300-\u0301]", "");

        return palabraSeleccionada;
    }
