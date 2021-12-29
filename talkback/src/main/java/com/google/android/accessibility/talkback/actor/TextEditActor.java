/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.accessibility.talkback.actor;

import static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE;
import static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_SET_TEXT;
import static com.google.android.accessibility.talkback.Feedback.FocusDirection.Action.SELECTION_MODE_OFF;
import static com.google.android.accessibility.talkback.Feedback.FocusDirection.Action.SELECTION_MODE_ON;
import static com.google.android.accessibility.utils.output.FeedbackItem.FLAG_FORCED_FEEDBACK_AUDIO_PLAYBACK_ACTIVE;
import static com.google.android.accessibility.utils.output.FeedbackItem.FLAG_FORCED_FEEDBACK_MICROPHONE_ACTIVE;
import static com.google.android.accessibility.utils.output.FeedbackItem.FLAG_FORCED_FEEDBACK_SSB_ACTIVE;
import static com.google.android.accessibility.utils.output.FeedbackItem.FLAG_NO_HISTORY;
import static com.google.android.accessibility.utils.output.SpeechController.QUEUE_MODE_INTERRUPT;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.accessibility.talkback.Feedback;
import com.google.android.accessibility.talkback.Pipeline.FeedbackReturner;
import com.google.android.accessibility.talkback.R;
import com.google.android.accessibility.utils.AccessibilityNodeInfoUtils;
import com.google.android.accessibility.utils.EditTextActionHistory;
import com.google.android.accessibility.utils.PerformActionUtils;
import com.google.android.accessibility.utils.Performance.EventId;
import com.google.android.accessibility.utils.Role;
import com.google.android.accessibility.utils.SpeechCleanupUtils;
import com.google.android.accessibility.utils.input.TextCursorManager;
import com.google.android.accessibility.utils.output.SpeechController.SpeakOptions;
import com.google.android.libraries.accessibility.utils.log.LogUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

/** Executes text-editing actions on EditText views. */
public class TextEditActor {

  /////////////////////////////////////////////////////////////////////////////////////////////
  // Constants

  /**
   * It makes sense to interrupt all the previous utterances generated in the talkback context menu.
   * After the cursor action is performed, it's the most important to notify the user what happens
   * to the edit text.
   */
  private static final SpeakOptions SPEAK_OPTIONS =
      SpeakOptions.create()
          .setQueueMode(QUEUE_MODE_INTERRUPT)
          .setFlags(
              FLAG_NO_HISTORY
                  | FLAG_FORCED_FEEDBACK_AUDIO_PLAYBACK_ACTIVE
                  | FLAG_FORCED_FEEDBACK_MICROPHONE_ACTIVE
                  | FLAG_FORCED_FEEDBACK_SSB_ACTIVE);

  /////////////////////////////////////////////////////////////////////////////////////////////
  // Member variables

  private final Context context;
  private final EditTextActionHistory editTextActionHistory;
  private final TextCursorManager textCursorManager;
  private final ClipboardManager clipboard;
  private FeedbackReturner pipeline;

  /////////////////////////////////////////////////////////////////////////////////////////////
  // Construction

  public TextEditActor(
      Context context,
      EditTextActionHistory editTextActionHistory,
      TextCursorManager textCursorManager,
      ClipboardManager clipboard) {
    this.context = context;
    this.editTextActionHistory = editTextActionHistory;
    this.textCursorManager = textCursorManager;
    this.clipboard = clipboard;
  }

  public void setPipeline(FeedbackReturner pipeline) {
    this.pipeline = pipeline;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////
  // Methods

  /** Executes and announces move cursor to end of edit-text. */
  public boolean cursorToEnd(
      AccessibilityNodeInfoCompat node, boolean stopSelecting, EventId eventId) {

      return false;

  }

  /** Executes and announces move cursor to start of edit-text. */
  public boolean cursorToBeginning(
      AccessibilityNodeInfoCompat node, boolean stopSelecting, EventId eventId) {

      return false;

  }

  /** Executes and announces start selecting text in edit-text. */
  public boolean startSelect(AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /** Executes and announces end select text in edit-text. Modifies edit history. */
  public boolean endSelect(AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /** Executes and announces select-all text in edit-text. Modifies edit history. */
  public boolean selectAll(AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /**
   * Executes and announces copy text. If the node is edit-text, it would copy the selected text or
   * it would copy the first non-empty node text within the root node.
   */
  public boolean copy(@Nullable AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /** Executes and announces cut text in edit-text. Modifies edit history. */
  public boolean cut(AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /** Executes and announces delete text in edit-text. Modifies edit history. */
  public boolean delete(AccessibilityNodeInfoCompat node, EventId eventId) {
      return false;

  }

  /** Executes and announces paste text in edit-text. Modifies edit history. */
  public boolean paste(AccessibilityNodeInfoCompat node, EventId eventId) {

      return false;

  }

  /** Inserts text in edit-text. Modifies edit history. */
  public boolean insert(
      AccessibilityNodeInfoCompat node, CharSequence textToInsert, EventId eventId) {

      return false;

  }

  /** Moves cursor in edit-text. */
  private boolean moveCursor(AccessibilityNodeInfoCompat node, int cursorIndex, EventId eventId) {


      return false;

  }
}
