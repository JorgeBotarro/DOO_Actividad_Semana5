package model;

public enum TipoGuia {
    sitio,
    circuito,
    traslado;

    public static TipoGuia parseTipoGuia(String tipo) {
        return switch (tipo.strip().toLowerCase()) {
            case "sitio" -> sitio;
            case "circuito" -> circuito;
            case "traslado" -> traslado;
            default -> throw new IllegalArgumentException("Error al convertir '"+tipo+"' a TipoGuia.");
        };
    }
}
