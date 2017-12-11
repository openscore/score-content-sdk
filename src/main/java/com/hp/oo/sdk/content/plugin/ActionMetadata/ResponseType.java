package com.hp.oo.sdk.content.plugin.ActionMetadata;

/**
 * This enum is used in Studio the create operations from the @Action/IActions
 * Do not modify this file unless we modify also OperationResponse Type in studio
 */
//TODO: Fix Javadoc - reference to OO Studio
public enum ResponseType {
    RESOLVED,
    DIAGNOSED,
    ERROR,
    NO_ACTION_TAKEN,
    RESOLVE_BY_NAME
}
