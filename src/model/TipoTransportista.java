package model;

/**
 * Especialidad del Transportista
 */
public enum TipoTransportista {
    auto,
    microbus,
    bus;

    /**
     * Similar a Double.parseDouble en idea.
     * @param tipo representacion textual del enum
     * @return tipo de Transportista
     */
    public static TipoTransportista parseTipoTransportista(String tipo) {
        return switch (tipo.strip().toLowerCase()) {
            case "auto" -> auto;
            case "microbus" -> microbus;
            case "bus" -> bus;
            default -> throw new IllegalArgumentException("Error al convertir '"+tipo+"' a TipoTransportista.");
        };
    }
}
