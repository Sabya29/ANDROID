// Generated by view binder compiler. Do not edit!
package com.example.madp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.madp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityApplyJobEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button14;

  @NonNull
  public final EditText editTextTextPersonName16;

  @NonNull
  public final EditText editTextTextPersonName17;

  @NonNull
  public final EditText editTextTextPersonName18;

  @NonNull
  public final TextView textView29;

  @NonNull
  public final TextView textView31;

  @NonNull
  public final TextView textView32;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private ActivityApplyJobEditBinding(@NonNull ConstraintLayout rootView, @NonNull Button button14,
      @NonNull EditText editTextTextPersonName16, @NonNull EditText editTextTextPersonName17,
      @NonNull EditText editTextTextPersonName18, @NonNull TextView textView29,
      @NonNull TextView textView31, @NonNull TextView textView32, @NonNull TextView textView5,
      @NonNull TextView textView6) {
    this.rootView = rootView;
    this.button14 = button14;
    this.editTextTextPersonName16 = editTextTextPersonName16;
    this.editTextTextPersonName17 = editTextTextPersonName17;
    this.editTextTextPersonName18 = editTextTextPersonName18;
    this.textView29 = textView29;
    this.textView31 = textView31;
    this.textView32 = textView32;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityApplyJobEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityApplyJobEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_apply_job_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityApplyJobEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button14;
      Button button14 = ViewBindings.findChildViewById(rootView, id);
      if (button14 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName16;
      EditText editTextTextPersonName16 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName16 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName17;
      EditText editTextTextPersonName17 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName17 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName18;
      EditText editTextTextPersonName18 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName18 == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = ViewBindings.findChildViewById(rootView, id);
      if (textView29 == null) {
        break missingId;
      }

      id = R.id.textView31;
      TextView textView31 = ViewBindings.findChildViewById(rootView, id);
      if (textView31 == null) {
        break missingId;
      }

      id = R.id.textView32;
      TextView textView32 = ViewBindings.findChildViewById(rootView, id);
      if (textView32 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityApplyJobEditBinding((ConstraintLayout) rootView, button14,
          editTextTextPersonName16, editTextTextPersonName17, editTextTextPersonName18, textView29,
          textView31, textView32, textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}