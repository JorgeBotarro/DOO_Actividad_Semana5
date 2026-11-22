package model;

public enum TipoTransportista {
    auto,
    microbus,
    bus;

    public static TipoTransportista parseTipoTransportista(String tipo) {
        return switch (tipo.strip().toLowerCase()) {
            case "auto" -> auto;
            case "microbus" -> microbus;
            case "bus" -> bus;
            default -> throw new IllegalArgumentException("Error al convertir '"+tipo+"' a TipoTransportista.");
        };
    }
}
