//
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE.md file in the project root for full license information.
//
package com.microsoft.cognitiveservices.speech.intent;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.util.Contracts;

/**
 * Defines content of an intent recognizing/recognized events.
 */
public class IntentRecognitionEventArgs extends com.microsoft.cognitiveservices.speech.RecognitionEventArgs {

    IntentRecognitionEventArgs(com.microsoft.cognitiveservices.speech.internal.IntentRecognitionEventArgs eventArg) {
        super(eventArg);
        Contracts.throwIfNull(eventArg, "eventArg");

        this.eventArgImpl = eventArg;
        this._Result = new IntentRecognitionResult(eventArg.GetResult());
    }

    /**
     * Represents the intent recognition result.
     * @return Represents the intent recognition result.
     */
    public final IntentRecognitionResult getResult() {
        return _Result;
    }
    private IntentRecognitionResult  _Result;


    /**
     * Returns a String that represents the session id and the intent recognition result event.
     * @return A String that represents the intent recognition result event.
     */
    @Override
    public String toString() {
        return "SessionId:" + getSessionId() +
                " ResultId:" + _Result.getResultId() +
                " Reason:" + _Result.getReason() +
                " IntentId:<" + _Result.getIntentId() +
                "> Recognized text:<" + _Result.getText() +
                "> Recognized json:<" + _Result.getProperties().getProperty(PropertyId.SpeechServiceResponse_JsonResult) +
                "> LanguageUnderstandingJson <" + _Result.getProperties().getProperty(PropertyId.LanguageUnderstandingServiceResponse_JsonResult) + ">.";
    }

    // Hold the reference.
    @SuppressWarnings("unused")
    private com.microsoft.cognitiveservices.speech.internal.IntentRecognitionEventArgs eventArgImpl;
}