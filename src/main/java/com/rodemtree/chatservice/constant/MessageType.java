package com.rodemtree.chatservice.constant;

public class MessageType {
    public static final String INVITE_RESPONSE = "INVITE_RESPONSE";
    public static final String ACCEPT_INVITE_RESPONSE = "ACCEPT_INVITE_RESPONSE";
    public static final String REJECT_INVITE_RESPONSE = "REJECT_INVITE_RESPONSE";
    public static final String DISCONNECT_RESPONSE = "DISCONNECT_RESPONSE";
    public static final String CREATE_CHANNEL_RESPONSE = "CREATE_CHANNEL_RESPONSE";
    public static final String QUIT_CHANNEL_RESPONSE = "QUIT_CHANNEL_RESPONSE";

    // Notification
    public static final String ASK_INVITE = "ASK_INVITE";
    public static final String NOTIFY_ACCEPT_INVITE = "NOTIFY_ACCEPT_INVITE";
    public static final String NOTIFY_JOIN_CHANNEL = "NOTIFY_JOIN_CHANNEL";
    public static final String NOTIFY_MESSAGE = "NOTIFY_MESSAGE";
}
